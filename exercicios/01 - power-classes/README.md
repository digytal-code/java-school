# Digytal Code - Programação, Pesquisa, Educação

#### Autores
- [Gleyson Sampaio](https://github.com/glysns)

## Power Classes
O nosso desafio é explorar as principais classes da linguagem Java.

#### Requisitos
1. Realizar uma breve descrição da classe em questão;
1. Apresentar alternativas de instanciação de objetos com `construtor` ou metódos `instance` ;
1. Apresentar no mínimo 04 métodos mais utilizados destacando o seu contrato (tipo retorno + nome + parâmetros);
1. Apresentar se alguns dos métodos é `sobrecarregado`;
1. Realizar uma demonstração adaptando o uso dos métodos (mínimo 04) em situações do cotidiando (use a imaginação);

#### Classes por Grupo

##### Grupo 01
- java.lang.String
- java.util.StringJoiner
- java.lang.StringBuilder

##### Grupo 02
- Descrição do que são classes Wrappers
- java.lang.Integer
- java.lang.Double

##### Grupo 03
- java.util.Calendar
- java.time.LocalDate
- java.time.LocalDateTime

##### Grupo 04
- java.lang.String.format() - formatar Strings
- java.time.format.DateFormatter e java.time.format.DateTimeFormatter
- java.text.DecimalFormat e java.text.NumberFormat

##### Grupo 05
- java.io.File
- java.nio.file.Files
- java.nio.file.Path
- java.nio.file.Paths

###### 05 - Links
[Dev Dojo](https://www.youtube.com/watch?v=RX3kPWkuZMQ)

##### Grupo 06
- java.lang.Object
- java.lang.Math
- java.math.BigDecimal


#### Dicas
- Use a documentação oficial da Oracle + outras referências e exemplos na internet
- Atuar em conjunto para resolver o item 1 de requisitos e depois tentar distribuir entre os integrantes do grupo
- Testes, testes e mais testes, pensem previamente no resultado e validem no console
- O Grupo 04 poderá/deverá interagir com os demais grupos
- A apresentação será realizada em 10 minutos
- Definam antecipadamente a ordem dos apresentadores
- Usem o próprio README.md com os recursos de Markdown.
- Preferencialmente subam o conteúdo (apresentação + exemplos) no repositório da School


#### Prática com o Professor
###### Projeto OpenBank
O Banco Central requisitou aos bancos e financeiras que diariamente fosse enviado um arquivo contendo as movimentações de clientes contendo as seguintes informações:
Data da Movimentação, Cpf / Cnpj e Nome Cliente, Valor e Tipo da Movimentação e se a Movimentação foi estornada.

Estas movimentações deverão ser disponibilizadas em arquivo contendo o layout posicional abaixo:

| Ordem | Campo | Tamanho | Valor Real | Valor Formatado |
| ----- | ----- | ------- | ---------- | --------------- |
| 01    | Data  | 08      | 16/04/2022 | 20220416        |
| 02    | CPF\CNPJ   | 14      | 135.217.791-18 | 00013521779118 |
| 03    | Nome   | 30      | RAIMUNDO NONATO LOUREIRO CASTELO BRANCO | RAIMUNDO NONATO LOUREIRO CAST |
| 04    | Valor   | 10      | 1.275,48 | 0000127548  |
| 05    | Tipo Mov.   | 1      | RECEITA / DESPESA | R ou D  |
| 06    | Estornado   | 1      | true / false | 1 ou 0  |


* Cada linha de movimentação deverá ter a estrutura conforme ilustração seguir:

``2022041600013521779118RAIMUNDO NONATO LOUREIRO CAST0000127548R0``

* O conteúdo deverá ser disponibilizado via arquivo chamado de **AAAA-MM-DD_movimentacao.txt** no diretório c:\estudos\banco_central\movimentacoes

###### Etapas de desenvolvimento:

1. Criar o projeto Maven gerador_arquivo para converter as movimentações em texto e gerar o arquivo;
1. Criar o projeto Maven leitor_arquivo para ler o arquivo e converter em objetos.

* Depois das funcionalidades estarem funcionando, deverá ter uma nova funcionalidade para converter as movimentações no padrão layout delimitado, exemplo:

``20220416;00013521779118;RAIMUNDO NONATO LOUREIRO CAST;0000127548;R;0``

* Depois gerar o arquivo chamado de **AAAA-MM-DD_movimentacao.csv** no diretório c:\estudos\banco_central\movimentacoes
* Realizar a leitura do arquivo **csv** para também converter em movimentações

###### Referências

* [Classes](!https://glysns.gitbook.io/java-basico/programacao-orientada-a-objetos/classes)
* [Construtores](!https://glysns.gitbook.io/java-basico/programacao-orientada-a-objetos/construtores)






