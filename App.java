import java.util.List;

public class App {
   public static void main(String[]args){

    CatalogoVeiculos catalogo = new CatalogoVeiculos(List.of(
      new VeiculoPasseio("ab1c234","VW","Gol",1995, 10_000, 10.5),
      new VeiculoUtilitario("rgs6754","VW","Saveiro",2010, 25_000, 1, 2),
      new VeiculoPassageiros("hya8966","Kia","Telluride",2018, 50_000, 7)  
    ));

    System.out.println(catalogo.consultaPorAno(1995));
    System.out.println(catalogo.consultaPorMarca("VW"));
    System.out.println(catalogo.consultaPorPlaca("hya8966"));
    System.out.println(catalogo.consultaPorTipo("passeio"));

   }
}
