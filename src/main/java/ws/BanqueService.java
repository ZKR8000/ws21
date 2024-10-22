package ws;

import jakarta.jws.WebService;

import java.util.Date;
import java.util.List;

@WebService()
public class BanqueService {
    public double conversion(double mt){
        return mt*10.45;

    }
    public Compte getCompte(int code){
     return new Compte(code,Math.random()*9888,new Date());
    }
    public List<Compte> compteList(){
        return  List.of(
                new Compte(1,Math.random()*9888,new Date()),
                new Compte(2,Math.random()*9888,new Date()),
                new Compte(3,Math.random()*9888,new Date())
        );
    }
}
