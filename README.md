# FilmeLover - Consumo da API TMDB (The Movie Database) 

Este micro app tem como objetivo utilizar a API gratuita da TMDB para buscar e mostrar: sinopse, nome, imagem, data de lançamento e média do respectivo filme procurado.

## Funcionalidades 🛠️

| Funcionalidade          | Descrição                                                                                       |
|-------------------------|-------------------------------------------------------------------------------------------------|
| Buscar um filme        | O usuário pesquisa um filme na barra de pesquisa e é redirecionado para uma segunda tela que exibe as informações desse filme. |


## Tecnologias Utilizadas 🚀

- **The Movie Database API**: Serviço de banco de dados para buscar as informações do filme.

## Como Usar 📋

1. Faça o download do código-fonte do projeto.
2. Importe o projeto para o Android Studio.
3. Certifique-se de configurar o Firebase no projeto.
4. Compile e execute o aplicativo em um dispositivo ou emulador Android.

## Telas 📱
### Tela de Pesquisa
<p>Permite que o usuário digite um filme.</p>
<img src="https://github.com/LarissaSL/APIFilme_Mobile/assets/112571317/c2b4e21c-6bcf-41e1-aa2d-3638fd45f268" width="300">

### Tela de Resultado
<p>Exibe os dados do filme pesquisado.</p>
<img src="https://github.com/LarissaSL/APIFilme_Mobile/assets/112571317/518723c9-b780-41be-adab-f5e3b818dbbf" width="300">

## Desenvolvimento

| Desenvolvimento                           | Descrição                                                                                                                                                                            |
|-------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Separação dos Ícones e Imagens para a Pasta Drawable | Organização dos recursos visuais, como ícones e imagens, em diretórios específicos dentro da pasta `res` do projeto Android.                                                  |
| Criação dos Layouts Provisórios  | Desenvolvimento dos layouts de interface do usuário (XML) para as diferentes telas da aplicação. |
| Consumo da API | Preparação de uma função para consumir a API TMDB. |
| Separação da Lógica de Busca e da Troca das Informações na View | Criação de duas funções: uma para buscar na API os dados do filme e outra para exibir esses resultados na view para o usuário. |
| Criação dos Layouts Oficiais | Desenvolvimento do layout oficial do app, começando pelo Main Activity e depois pela TelaInfoFilme. |
| Lógica para caso não exista o Filme | Lógica para redirecionar para a tela principal e exibir uma mensagem de erro ao tentar buscar um filme que não existe. |
| Lógica botão voltar | Criação da função `voltarParaInicio`, permitindo que o usuário seja redirecionado para a tela principal depois de realizar uma busca. |

## 🎥 Materiais de Apoio Utilizados

Aqui estão alguns vídeos que utilizei como apoio durante o desenvolvimento:

- [![YouTube Video 1](https://img.shields.io/badge/Assistir-Video%201-red)](https://www.youtube.com/watch?v=3YVhWjIUkKY&t=1s) **Como usar a API do The Movie Database em Java: Exemplo prático**

- [![YouTube Video 2](https://img.shields.io/badge/Assistir-Video%202-red)](https://www.youtube.com/watch?v=jfPhS_ZCr9g) **Importando fontes do Google Fonts pelo Android Studio**

- [Documentação Oficial da API TMDB](https://developer.themoviedb.org/docs/getting-started)


## Simulação 🎬

Aqui está uma simulação do aplicativo em funcionamento:

![Simulação do Aplicativo](https://github.com/LarissaSL/APIFilme_Mobile/blob/main/API_Filme.gif)


## Licença ⚖️

Imagens de Freepik

Fonte do Google Fonts

Design por LarissaSL
