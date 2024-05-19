package edu.badpals.galleygrub.extras;

import edu.badpals.galleygrub.order.Comanda;
import java.util.Optional;

public class CheeseExtra extends Extra {

    public CheeseExtra() {};

    @Override
    public void sumExtras(Comanda order) {
        
        Optional<Double> cheeseCharge = order.itemList().stream()
                            .filter(item -> item.extra().equalsIgnoreCase(Extras.CHEESE.name()))
                            .map(item -> Extras.CHEESE.getPrice())
                            .reduce(Double::sum);

        if (cheeseCharge.isPresent()) {
            order.updateTotal(cheeseCharge.get());
        }

        this.nextExtra.ifPresent(chain -> chain.sumExtras(order));

    }
    
}