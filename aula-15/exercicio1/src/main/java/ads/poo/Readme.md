```mermaid
classDiagram
    direction LR
    class Agenda {
        
    }
    
    class Contato{
        
    }
    
    class ColecaoTelefone{
        
    }
    
    class ColecaoEmail{
        
    }
    
    class App{
        
    }
    
    Agenda "0.." *-- "1" Contato
    Contato "1" *-- "0.." ColecaoTelefone
    Contato "1" *-- "0.." ColecaoEmail
    App ..> Contato
    App "1" *-- "1" Agenda
    
```