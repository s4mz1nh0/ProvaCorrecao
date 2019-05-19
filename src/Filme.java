
public class Filme {
   private Diretor diretor;
   private Data dataLancamento;
   private String genero;
    
public Diretor getDiretor(){
return this.diretor;
}    
    
public Data getData(){
return this.dataLancamento;
}

public void setDiretor(Diretor diretor){
this.diretor= diretor;
}

public void setData(Data dataLancamento){
this.dataLancamento= dataLancamento;
}

 void mostrar(){
        System.out.println(this.genero);
        this.diretor.mostrar();
        this.dataLancamento.mostrar();
    }
    boolean informarGenero(String s){
        this.genero=s;
        if((s.equals("Terror"))||(s.equals("Romance"))||(s.equals("Ação"))){
            return true;
        }
        else{
            return false;
        }
}}
