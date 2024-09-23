# Diagrama UML e Implementação do iPhone

Este projeto modela o componente iPhone, abrangendo suas funcionalidades de **Reprodutor Musical**, **Aparelho Telefônico** e **Navegador na Internet**.

## Diagrama UML (Textual)

```plaintext
+-----------------------------------------------------+
|                       iPhone                        |
+-----------------------------------------------------+
| + tocar()                                           |
| + pausar()                                          |
| + selecionarMusica(String musica)                   |
|                                                     |
| + ligar(String numero)                              |
| + atender()                                         |
| + iniciarCorreioVoz()                               |
|                                                     |
| + exibirPagina(String url)                          |
| + adicionarNovaAba()                                |
| + atualizarPagina()                                 |
+-----------------------------------------------------+
                /         |          \
               /          |           \
 +----------------+   +-----------------+   +------------------+
 | ReprodutorMusical | |  AparelhoTelefonico  | | NavegadorInternet |
 +------------------+ +--------------------+ +-------------------+
 | + tocar()        | | + ligar(String)    | | + exibirPagina()   |
 | + pausar()       | | + atender()        | | + adicionarNovaAba()|
 | + selecionarMusica()| | + iniciarCorreioVoz()| | + atualizarPagina() |
 +------------------+ +--------------------+ +-------------------+
