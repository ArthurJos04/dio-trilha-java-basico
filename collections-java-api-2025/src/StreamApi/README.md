# 📘 Operações com Java Streams

Este documento apresenta as principais **operações intermediárias e terminais** da API de Streams do Java, com explicações e exemplos práticos.

---

## 🚧 Operações Intermediárias

### 🔹 `filter(Predicate<T> predicate)`
- **Descrição:** Filtra elementos com base em uma condição.
- **Retorno:** Nova `Stream` contendo apenas os elementos que satisfazem o predicado.
- **Exemplo:**
  ```java
  stream.filter(n -> n > 5)
  ```

---

### 🔹 `map(Function<T, R> mapper)`
- **Descrição:** Transforma cada elemento da `Stream` utilizando a função especificada.
- **Retorno:** Nova `Stream` com os elementos transformados.
- **Exemplo:**
  ```java
  stream.map(s -> s.toUpperCase())
  ```

---

### 🔹 `sorted()`
- **Descrição:** Ordena os elementos da `Stream` em ordem natural ou com base em um comparador.
- **Exemplo:**
  ```java
  stream.sorted()
  ```

---

### 🔹 `distinct()`
- **Descrição:** Remove elementos duplicados com base no método `equals()`.
- **Exemplo:**
  ```java
  stream.distinct()
  ```

---

### 🔹 `limit(long maxSize)`
- **Descrição:** Limita o número de elementos da `Stream`.
- **Exemplo:**
  ```java
  stream.limit(10)
  ```

---

### 🔹 `skip(long n)`
- **Descrição:** Ignora os primeiros `n` elementos da `Stream`.
- **Exemplo:**
  ```java
  stream.skip(5)
  ```

---

## ✅ Operações Terminais

### 🔸 `forEach(Consumer<T> action)`
- **Descrição:** Executa uma ação para cada elemento da `Stream`.
- **Exemplo:**
  ```java
  stream.forEach(System.out::println)
  ```

---

### 🔸 `toArray()`
- **Descrição:** Converte a `Stream` em um array.
- **Exemplo:**
  ```java
  stream.toArray()
  ```

---

### 🔸 `collect(Collector<T, A, R> collector)`
- **Descrição:** Coleta os elementos da `Stream` em uma estrutura de dados (lista, conjunto, mapa etc.).
- **Exemplo:**
  ```java
  stream.collect(Collectors.toList())
  ```

---

### 🔸 `count()`
- **Descrição:** Retorna a quantidade de elementos da `Stream`.
- **Exemplo:**
  ```java
  stream.count()
  ```

---

### 🔸 `anyMatch(Predicate<T> predicate)`
- **Descrição:** Verifica se **algum** elemento atende ao predicado.
- **Exemplo:**
  ```java
  stream.anyMatch(s -> s.startsWith("A"))
  ```

---

### 🔸 `allMatch(Predicate<T> predicate)`
- **Descrição:** Verifica se **todos** os elementos atendem ao predicado.
- **Exemplo:**
  ```java
  stream.allMatch(n -> n > 0)
  ```

---

### 🔸 `noneMatch(Predicate<T> predicate)`
- **Descrição:** Verifica se **nenhum** elemento atende ao predicado.
- **Exemplo:**
  ```java
  stream.noneMatch(s -> s.isEmpty())
  ```

---

### 🔸 `min(Comparator<T> comparator)` / `max(Comparator<T> comparator)`
- **Descrição:** Retorna o elemento mínimo ou máximo, de acordo com o comparador.
- **Exemplo:**
  ```java
  stream.min(Comparator.naturalOrder())
  stream.max(Comparator.naturalOrder())
  ```

---

### 🔸 `reduce(T identity, BinaryOperator<T> accumulator)`
- **Descrição:** Reduz os elementos da `Stream` a um único valor, com base no acumulador fornecido.
- **Exemplo:**
  ```java
  stream.reduce(0, (a, b) -> a + b)
  ```

---

📌 *Essa documentação serve como referência rápida para o uso eficiente das Streams na programação funcional com Java.*
