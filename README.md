# MovieLover - Consumo da API TMDB (The Movie Database) 

Esse micro app tem como objetivo utilizar a API gratuita da TMDB para Buscar e mostrar: Sinopse, Nome, Imagem, Data de Lançamento e Média, do respectivo filme procurado.

## Funcionalidades 🛠️

| Funcionalidade          | Descrição                                                                                       |
|-------------------------|-------------------------------------------------------------------------------------------------|
| Buscar um filme        | O usuário pesquisa um filme na Barra de Pesquisa e é redirecionado para uma segunda Tela que exibe as informações desse Filme. |


## Tecnologias Utilizadas 🚀

- **The Movie Database API**: Ser o banco de dados para buscar as informações do Filme

## Como Usar 📋

1. Faça o download do código-fonte do projeto.
2. Importe o projeto para o Android Studio.
3. Certifique-se de configurar o Firebase no projeto.
4. Compile e execute o aplicativo em um dispositivo ou emulador Android.

## Telas 📱
### Tela de Pesquisa
<p>Permite que o usuário digite um Filme</p>
<img src="https://github.com/LarissaSL/LoginComFirebase/assets/112571317/1a7c1a06-0c92-4425-9cd9-5fdc23a2aa4a" width="300">

### Tela de Resultado
<p>Exibe os dados do Filme pesquisado</p>
<img src="https://github.com/LarissaSL/LoginComFirebase/assets/112571317/53da6d4a-f5fe-41c0-a4c5-1799d9081514" width="300">

## Desenvolvimento

| Desenvolvimento                           | Descrição                                                                                                                                                                            |
|-------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Separação dos Icones e Imagens para a Pasta Drawable | Organização dos recursos visuais, como ícones e imagens, em diretórios específicos dentro da pasta `res` do projeto Android.                                                  |
| Criação dos Layouts Provisórios  | Desenvolvimento dos layouts de interface do usuário (XML) para as diferentes telas da aplicação. |
| Consumir a API | Preparando uma função para Consumir a API TMDB. |
| Separar a Lógica de Busca e da Trocar as informações na View | Criação de duas funções , uma para Buscar na API os dados do Filme e outra para Exibir esses resultados na View pro Usuario. |
| Criação dos Layouts Oficiais | Desenvolvimento do Layout oficial do APP, começando pelo Main Activity e depois a TelaInfoFilme. |
| Lógica para caso não existir o Filme | Lógica para redirecionar para a tela principal e exibir uma mensagem de Erro ao tentar buscar um filme que não existe. |
| Lógica botão voltar | Criar a função de voltarParaInicio, fazendo o usuário ser redirecionado a Tela Principal depois de realizar uma busca. |

## 🎥 Materiais de Apoio Usados

Aqui estão alguns vídeos que utilizei como apoio durante o desenvolvimento:

- [![YouTube Video 1]([https://img.shields.io/badge/Assistir-Video%201-red)](https://youtu.be/8gp5zWOZT0c](https://www.youtube.com/watch?v=3YVhWjIUkKY&t=1s)) **Como usar a API do The Movie Database em Java: Exemplo prático**

- [![YouTube Video 2]([https://img.shields.io/badge/Assistir-Video%202-red)](https://youtu.be/UiFl3hCQu_I](https://www.youtube.com/watch?v=jfPhS_ZCr9g)) **Importando fontes do Google Fonte pelo Android Studio**

- [Documentação Oficial da API TMDB]([https://developer.android.com/topic/libraries/view-binding?hl=pt-br](https://developer.themoviedb.org/docs/getting-started))


## Simulação 🎬

Aqui está uma simulação do aplicativo em funcionamento:

![Busca](https://github.com/LarissaSL/LoginComFirebase/assets/112571317/b7eab613-4c1f-4af6-9af2-99677a44c163)


## Licença ⚖️

Imagens de Freepik
Font do Google Fonts

Design por LarissaSL
