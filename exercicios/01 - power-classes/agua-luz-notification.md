# Água / Luz - Notification - Case

#### Case 1
Nossa fabrica de software foi designada a criar um aplicativo para notificar confirmação de `Contrato` de instalação de água e luz em `Cadastro`s realizados em sua cidade.

###### O aplicativo deverá enviar a seguinte mensagem:

Senhor(a) **Gleyson Sampaio** cpf de número **234.765.987-27**, 
Informamos que conforme contrato com protocolo de número **2022025687** está agendado para a data\hora **21/02/2022** **16:00h** a instalação do serviço de **Água** com taxa de valor R$ **127,33** em sua residência localizada no endereço abaixo:

- Logradouro: **Rua das Marias, 243**
- Complemento: **Ap 207, Bloco C**
- Bairro: **Santo Antonio**
- Cidade: **São Paulo / SP**
- Cep: **27.310-657**

###### os campos em negrito representam os atributos das classes envolvidas

#### Case 2

Nossa fabrica de software foi designada a criar um aplicativo para atrair e notificar confirmação de `Contrato` de instalação de água e luz em `Cadastro`s realizados em sua cidade.

###### O aplicativo deverá enviar a seguinte mensagem:

Senhor(a) **Gleyson Sampaio** cpf de número **234.765.987-27**,
Informamos que conforme contrato com protocolo de número **2022025687** está agendado para a data\hora **21/02/2022** **16:00h** a instalação do serviço de **Água** com taxa de valor R$ **127,33** em sua residência localizada no endereço abaixo:

- Logradouro: **Rua das Marias, 243**
- Complemento: **Ap 207, Bloco C**
- Bairro: **Santo Antonio**
- Cidade: **São Paulo / SP**
- Cep: **27.310-657**

1. Podem existir cadastros fora do Brasil que muda a formatação de algumas informações.
2. Valores data e momentários devem considerar a localização do cadastro
3. Existem dois serviços com valores fixos: Água R$ 137,21 e Energia R$ 132,15

###### Arquitetura

1. Serão dois projetos Java Maven denominados: agua-luz-atracao e agua-luz-notificacao
2. O projeto agua-luz-atracao deverá disponibilizar um mecanismo de inclusão dos dados de cadastro (fake banco de dados)
3. O projeto agua-luz-atracao deverá disponibilizar dois arquivos no diretório `C:\estudo\mjv-java-school\agua-luz-output` com os nomes abaixo:
  - agua-luz-contratos.csv obedecendo o layout padrão delimitador (;) 
  - agua-luz-contratos.txt obedecendo o layout padrão posicional
4. O projeto agua-luz-notificacao deverá realizar a leitura dos contratos pelo arquivo `agua-luz-contratos.txt` para poder criar e enviar a mensagem via Sms ou Whatsapp
5. O projeto agua-luz-notificacao deverá realizar a geração de arquivo `contrato-cpf-xxx.txt` contendo a mensagem gerada. (Este requisito é um PLUS)

###### Layout posicional

Segue regras para posicionamento dos campos para o layout

| Campo  | Ordem |Tam.|Texto Original|Texto Layout   | Ini | Fim |
| ------ | ----- |--- | ------------ | ------------- | --- | --- |
| CPF | 01 |11 | 007.324.223.21 | 00732422321 | 0 | 11
| RG | 02 |10 | 33765-5 | 33765-5 | 11 | 21
| NOME | 03 |30 | Raimundo Nonato Loureiro Castelo Branco | RAIMUNDO NONATO LOUREIRO CASTE | 21 | 51
| CELULAR | 04 |11 | (11) 99768-1515 | 11997681515 | 51 | 62
| LOGRADOURO | 05 |20 | Rua Sebastião Firmino| RUA SEBASTIÃO FIRMI | 62 | 82
| NUMERO | 06 |06 | 123| 000123 | 82 | 88
| COMPLEMENTO | 07 |10 | AP 210 BL CENTAURO| AP 210 BL | 88 | 98
| BAIRRO | 08 |15 | São Sebastião| SÃO SEBASTIÃO | 98 | 113
| CIDADE | 09 |30 | São Raimundo Nonato| SÃO RAIMUNDO NONATO           | 113 | 143 
| UF | 10 |02 | Sp| SP| 143 | 145
| CEP | 11 |08 | 07.210.715 | O7210715 | 145 | 153
| PAIS ** | 12 |02 | Brasil | BR (criar enum com Paises [BRASIL, ESTADOS UNIDOS, FRANÇA] conforme link) [ISO-2](https://www.sport-histoire.fr/pt/Geografia/Codigos_ISO_Paises.php) |  153 | 155
| PROTOCOLO | 13 |10 | 1984365 | 0001984365 | 155 | 165
| DATA | 14 |08 | 07/05/2022 | 20220507 | 165 | 173
| HORA | 15 |04 | 15:21 | 1521 | 173 | 177
| TIPO SERVIÇO | 16 |01 | AGUA ou LUZ | A ou L | 177 | 179
| VALOR | 17 |08 | 127,35 | 00012735 | 179 | 186
| TIPO NOTIFICACAO ** | 18 |01 | SMS ou WHATS | S ou W | 186 | 187

#### Case 3

Nossa fabrica de software agora precisará armazenar os dados de atração em um banco de dados relacional PostgreSQL ou MySQL com base no layout `agua-luz-contratos.txt`. Logo precisaremos criar uma tabela `tab_contrato` determinando o DDL compatível com os registros na atração.

Segue modelo de DDL definição da tabela `tab_contrato`:

| Campo  | Tipo  | Tam. | Prec.| AI | NN |
| ------ | ----- | ---- | ---- | -- | -- |
| id | N |* | | S |S


###### Glossário

| Sigla | Descrição |
| ----- | --------- | 
| AI    | Auto increment|
| NN    | Not Null|

| Tipo | Conjunto | +Usado  |
| ---- | -------- | ------- |  
| Texto         | CHAR, VARCHAR, TEXT| VARCHAR |
| Inteiro       | INT, BIGINT, SMALLINT| INT |
| Decimal       | DECIMAL, FLOAT, NUMERIC (c,p)| DECIMAL |
| Data / Hora   | DATE, TIME, DATETIME, TIMESTEMP| DATE |
| Lógico        | BIT (0/1), BOOLEAN, CHAR(1)| AMBOS |
| Estrutural    | BLOB, JSON| JSON |
| Binário (image) | BLOB | BLOB |
