# 📚 Sistema de Geração de Planos de Estudos

## 1. Apresentação

O Sistema de Geração de Planos de Estudos é uma aplicação desktop desenvolvida em Java, com interface gráfica construída utilizando Java Swing.

O sistema tem como finalidade auxiliar estudantes na organização de suas rotinas de aprendizagem, permitindo selecionar disciplinas, definir conteúdos prioritários e organizar os horários disponíveis para estudo.

## 2. Problema

Muitos estudantes encontram dificuldades para organizar seus estudos, identificar quais conteúdos precisam de maior atenção e distribuir adequadamente o tempo disponível entre diferentes disciplinas.

Diante disso, o projeto propõe uma ferramenta que automatiza parte desse processo, facilitando a elaboração de uma rotina de estudos organizada.

## 3. Objetivos

### 3.1 Objetivo geral

Desenvolver um sistema capaz de auxiliar estudantes na criação de planos de estudos personalizados, considerando suas necessidades, dificuldades e disponibilidade de horários.

### 3.2 Objetivos específicos

- Permitir a seleção das disciplinas que serão estudadas.
- Disponibilizar a escolha dos conteúdos de cada disciplina.
- Identificar as prioridades de aprendizagem.
- Considerar a disponibilidade semanal do estudante.
- Gerar uma distribuição organizada dos horários de estudo.

## 4. Funcionalidades do sistema

| Funcionalidade | Descrição |
|---|---|
| Seleção de matérias | Escolha das disciplinas desejadas. |
| Seleção de conteúdos | Escolha dos assuntos que precisam ser estudados. |
| Definição de prioridades | Organização dos conteúdos conforme as necessidades do estudante. |
| Disponibilidade de horários | Registro dos horários disponíveis durante a semana. |
| Geração do cronograma | Distribuição das atividades de estudo ao longo da semana. |

## 5. Tecnologias utilizadas

- **Java:** linguagem utilizada no desenvolvimento da aplicação.
- **Java Swing:** biblioteca utilizada para a construção da interface gráfica.
- **Apache NetBeans:** ambiente de desenvolvimento integrado (IDE).
- **Programação Orientada a Objetos (POO):** paradigma utilizado na organização do código.

## 6. Arquitetura e organização do projeto

O projeto está organizado em pacotes que separam as responsabilidades da aplicação.

```text
src/
│
├── modelo/
│   └── Representação dos dados e entidades
│
├── visao/
│   └── Interfaces gráficas do sistema
│
└── controlador/
    └── Controle das operações e comunicação
        entre as interfaces e os modelos
```

### 6.1 Pacote modelo

Responsável por representar os dados utilizados pelo sistema, armazenando informações relacionadas às matérias e demais elementos do plano de estudos.

### 6.2 Pacote visao

Contém as interfaces gráficas desenvolvidas com Java Swing, responsáveis pela interação entre o usuário e a aplicação.

### 6.3 Pacote controlador

Responsável por coordenar as operações do sistema, controlar a navegação entre as telas e realizar a comunicação entre as interfaces e os modelos.

## 7. Fluxo de utilização

O funcionamento proposto para o sistema segue uma sequência de etapas:

1. O estudante inicia a aplicação.
2. Seleciona as matérias que deseja estudar.
3. Escolhe os conteúdos correspondentes.
4. Define as prioridades de aprendizagem.
5. Informa sua disponibilidade de horários.
6. O sistema organiza as informações e gera o cronograma de estudos.

## 8. Como executar o projeto

### Pré-requisitos

- Java Development Kit (JDK).
- Apache NetBeans.
- Git (opcional, para clonar o repositório).

### Instalação

1. Acesse o repositório do projeto no GitHub.
2. Baixe o projeto ou utilize o comando:

```bash
git clone URL_DO_REPOSITORIO
```

3. Abra o Apache NetBeans.
4. Selecione `File → Open Project`.
5. Localize a pasta do projeto.
6. Execute a aplicação pela IDE.

## 9. Imagens do sistema

As capturas de tela das interfaces serão adicionadas nesta seção para demonstrar visualmente o funcionamento da aplicação.

<!-- Adicionar imagens do sistema futuramente -->

## 10. Considerações finais

O desenvolvimento deste projeto busca aplicar os conhecimentos adquiridos na disciplina de Programação III, especialmente em Java, Programação Orientada a Objetos, interfaces gráficas e organização de software.

Além do aprendizado técnico, a proposta procura desenvolver uma solução que possa contribuir para a organização e o planejamento dos estudos.

## 11. Autoria

**Desenvolvedores:** Caetano Gonçalves Ribeiro & Ângela Bestetti Pereira

**Instituição:** Instituto Federal de Educação, Ciência e Tecnologia do Rio Grande do Sul (IFRS) – Campus Rolante.

**Curso:** Técnico em Informática Integrado ao Ensino Médio.

**Disciplina:** Programação III.

**Ano:** 2026.
