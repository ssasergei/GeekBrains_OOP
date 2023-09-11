// import Classes.Actor;
// import Classes.Market;
// import Classes.OrdinaryClient;
// import Classes.PromotiomalClient;
// import Classes.SpecialClient;
// import Classes.TaxInspector;
// import Interfaces.iActorBehaviour;

// public class App {
//     public static void main(String[] args) throws Exception {
//         Market magnit = new Market();

//         // iActorBehaviour client1 = new OrdinaryClient("boris");
//         // iActorBehaviour client2 = new SpecialClient("prezident", 1);
//         // iActorBehaviour client3 = new TaxInspector();
//         iActorBehaviour client4 = new PromotiomalClient("Vova", "Sale", 1 );

//         // magnit.acceptToMarket(client1);
//         // magnit.acceptToMarket(client2);
//         // magnit.acceptToMarket(client3);
//         magnit.acceptToMarket(client4);


//         magnit.update();
//     }
// }
import Classes.Actor;
import Classes.Market;
import Classes.OrdinaryClient;
import Classes.SpecialClient;
import Classes.TaxInspector;
import Classes.PromotiomalClient;
import Interfaces.iActorBehaviour;

public class App {
    public static void main(String[] args) throws Exception {
        Market magnit = new Market();

        iActorBehaviour client1 = new OrdinaryClient("boris");
        iActorBehaviour client2 = new SpecialClient("prezident", 1);
        iActorBehaviour client3 = new TaxInspector();

        magnit.acceptToMarket(client1);
        magnit.acceptToMarket(client2);
        magnit.acceptToMarket(client3);
        iActorBehaviour client4 = new PromotiomalClient("Ivan", "Action", 1);
        iActorBehaviour client5 = new PromotiomalClient("Petr", "Action", 2);
        iActorBehaviour client6 = new PromotiomalClient("Ilya", "Action", 2);
        
        magnit.acceptToMarket(client4);
        magnit.acceptToMarket(client5);
        magnit.acceptToMarket(client6);
        magnit.update();
    }
}