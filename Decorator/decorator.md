# Design Pattern Resumos

## Pattern: _Decorator_
Enfoque em ajudar na hora que seu código sofre alterações.     
Adicionar funcionalidades dinamicamente.    
Moto: fechado para modificação/aberto para extensão.    

### Passos    
- Cria a classe/componente principal com o(s) método(s) que poderão ser extendidos     
- Cria o seu decorator que é uma classe abstrata extendendo a classe principal    
- Crie métodos abstratos que você pretende que sejam _decorados_/implementados    
