
public class Teste {
    
public static void main(String[] args){

    Diretor p1=new Diretor();
        p1.setNome("Quentin Tarantino");
        Data d1=new Data();
        d1.setDia(01);
        d1.setMes(01);
        d1.setAno(1944);
        p1.setDataDeNascimento(d1);
        
        
        
        Filme f1=new Filme();
        f1.setDiretor(p1);
        Data d2=new Data();
        d2.setDia(12);
        d2.setMes(12);
        d2.setAno(2016);
        f1.setData(d2);
       
        
        p1.mostrar();
        f1.informarGenero("Terror");
        f1.mostrar();


}    
    
}
