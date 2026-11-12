# Mensagem Decorator

Implementação do padrão de projeto **Decorator** em Java.

## Estrutura

- `Elemento` — classe abstrata com o atributo `texto` e o método abstrato `imprimeTexto()`
- `Mensagem` — componente concreto
- `MensagemDecorator` — decorator abstrato que guarda o `elementoDecorado`
- `NegritoDecorator` — aplica negrito (`*trecho*`) em um trecho do texto
- `ItalicoDecorator` — aplica itálico (`_trecho_`) em um trecho do texto (`"*"` aplica no texto inteiro)

## Executar

```bash
javac -d out src/*.java
java -cp out Main
```

## Saída

```
Boa noite
*Boa* noite
_*Boa* noite_
```
