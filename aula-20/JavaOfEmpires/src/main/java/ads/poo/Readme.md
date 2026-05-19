````mermaid
classDiagram
    
    class Personagem{
        <<abstract>>
        -hp: int
        -atq: int
        -vel: int
        +atacar()
        +mover()
        +Personagem(hp: int, atq: int, vel: int )
    }
    
    class Aldeao{
        
    }
    
    class Arqueiro{
        
    }
    
    class Cavaleiro{
        
    }
    
    Aldeao --|> Personagem
    Arqueiro --|> Personagem
    Cavaleiro --|> Personagem
        
    


````