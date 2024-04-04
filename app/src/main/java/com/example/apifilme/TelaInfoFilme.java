package com.example.apifilme;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TelaInfoFilme extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_info_filme);

        // Obter o termo de busca da MainActivity
        String termoBusca = getIntent().getStringExtra("busca");

        // Iniciar a busca na API com o termo de busca
        fazerBuscaNaAPI(termoBusca);
    }

    private void fazerBuscaNaAPI(String tituloFilme) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    // Construindo a URL de solicitação para a API e minha chave de acesso
                    String apiKey = "b290f530cd79475e482c1c3351386ae0";
                    String urlString = "https://api.themoviedb.org/3/search/movie?query=" + tituloFilme + "&language=pt-BR&api_key=" + apiKey;
                    URL url = new URL(urlString);

                    // Fazer a conexão HTTP
                    HttpURLConnection conexao = (HttpURLConnection) url.openConnection();
                    conexao.setRequestMethod("GET");

                    // Ler o que a API devolveu
                    BufferedReader reader = new BufferedReader(new InputStreamReader(conexao.getInputStream()));
                    StringBuilder response = new StringBuilder();
                    String line;
                    while ((line = reader.readLine()) != null) {
                        response.append(line);
                    }
                    reader.close();

                    // Exibir os resultados na View
                    exibirResultadoNaView(response.toString());

                } catch (Exception e) {
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            Toast.makeText(TelaInfoFilme.this, "Erro ao buscar dados da API: " + e, Toast.LENGTH_SHORT).show();
                        }
                    });
                }
            }
        }).start();
    }

    private void exibirResultadoNaView(String resultado) {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                if (resultado != null) {
                    try {
                        // Converter a resposta JSON em um objeto JSONObject
                        JSONObject jsonResponse = new JSONObject(resultado);

                        // Obter o array de resultados de filmes da resposta
                        JSONArray resultsArray = jsonResponse.getJSONArray("results");

                        // Verificar se tem resultados de filmes
                        if (resultsArray.length() > 0) {
                            JSONObject firstMovie = resultsArray.getJSONObject(0);

                            // Obter dados do Filme
                            String movieTitle = firstMovie.getString("title");
                            String movieImage = firstMovie.getString("poster_path");
                            String movieOverview = firstMovie.getString("overview");
                            String releaseDate = firstMovie.getString("release_date");
                            double voteAverage = firstMovie.getDouble("vote_average");

                            // Formatar a data de lançamento
                            SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd");
                            SimpleDateFormat outputFormat = new SimpleDateFormat("dd/MM/yyyy");

                            Date date = inputFormat.parse(releaseDate);
                            releaseDate = outputFormat.format(date);

                            // Atualizar os TextViews com os dados do filme
                            TextView tituloFilme = findViewById(R.id.movieTitleTextView);
                            TextView sinopseFilme = findViewById(R.id.movieOverviewTextView);
                            TextView dataLancamentoFilme = findViewById(R.id.releaseDateTextView);
                            TextView mediaFilme = findViewById(R.id.voteAverageTextView);
                            ImageView posterFilme = findViewById(R.id.moviePosterImageView);

                            tituloFilme.setText(movieTitle);
                            sinopseFilme.setText(movieOverview);
                            dataLancamentoFilme.setText("Data de Lançamento: " + releaseDate);
                            mediaFilme.setText("Média: " + voteAverage);

                            // Carregar e exibir o pôster do filme
                            Picasso.get().load("https://image.tmdb.org/t/p/w500" + movieImage).into(posterFilme);
                        } else {
                            // Se não houver resultados, exibir uma mensagem
                            Toast.makeText(TelaInfoFilme.this, "Nenhum filme encontrado", Toast.LENGTH_SHORT).show();
                        }
                    } catch (JSONException e) {
                        e.printStackTrace();
                    } catch (ParseException e) {
                        throw new RuntimeException(e);
                    }
                } else {
                    // Exiba uma mensagem de erro
                    Toast.makeText(TelaInfoFilme.this, "Erro ao buscar dados da API", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}