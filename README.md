# questao1-Configuracao

Enunciado - Configuração:

Vários tipos de software mantêm arquivos de configuração/propriedades centralizados por conta do benefício de consistência e desempenho. Isso evita que vários usuários acessem e leiam repetidamente o arquivo. O software cria uma única instância do arquivo de configuração que pode ser acessada por várias chamadas simultaneamente, pois fornecerá dados de configuração estáticos carregados em objetos na memória.

O software apenas lê o arquivo de configuração na primeira vez e, a partir da segunda chamada, os aplicativos clientes leem os dados dos objetos na memória.

Dado o exemplo de arquivo de configuração de um jogo abaixo, usando o Padrão Singleton, escreva um programa que lê o arquivo, o armazena em memória, e imprime todos os dados do arquivo de configuração.

Você deverá armazenar os dados do arquivo numa classe que modela/representa o arquivo de configuração a ser lido.

Note que outros componentes do software que usam o arquivo de configuração podem querer acessar individualmente os campos do arquivo de configuração.

Saida Esperada:
 
AppId=1649240
UserName=elamigos
Language=brazilian
Offline=0
AutoDLC=0
BuildId=10547147
DLCName=Returnal Pre-Purchase Entitlement
UpdateDB=1
Signature=FitGirl
WindowInfo=LAAAAAAAAAAIP50AAACIAAAATQMAAJACAAA=
LVWindowInfo=AwAAADEBAAByAAAApQAAAA==
ApplicationPath=../../../Returnal.exe
WorkingDirectory=
WaitForExit=1
NoOperation=0


# PROMPTs

# Prompt 1:
"estou fazendo uma lista da disciplina de padroes de projeto, me ajude com as questoes me mostrando o passo a passo para que consiga faze-la, segue a primeira questao:
'enunciado completo'

Resposta da IA (Gemini):

Gerou um roteiro completo de implementação passo a passo com:
● Criação da classe ConfigurationManager aplicando o padrão Singleton
● Implementação das funcionalidades de leitura
● Criação da classe cliente Main


Cada passo incluiu:
● Código completo do arquivo
● Exemplo de Mensagem de commit
● Justificativa do conceito no código (padrão Singleton)

E por fim, a Saída esperada do programa.

A IA conseguiu me ajudar sem erros.