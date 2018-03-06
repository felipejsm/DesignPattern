# Design Pattern Resumos

## Pattern: _Strategy_
### Resumo    
Isolar as partes do código que será volátil da parte imutável     
_Tem-um_ ao invés de _é um_    
Logo, pego as partes voláteis e as encapsulo    
### Passos    
- Transformar o código volátil em uma interface com o método que todos deverão implementar    
- Pra cada algoritmo, criar classe que implemente essa interface     
- Na classe imutável, adicionar a interface como membro(tem um), e criar um método Set pra ele. Porque preciso _settar_ o meu membro e também implementar o método da interface    
- As classes que estenderão a classe imutável, deverão implementar o seu método de acordo com suas características   
- Pronto, só chamar a implementação que você precisa    

### Exemplos Implementados     
- Correios    
