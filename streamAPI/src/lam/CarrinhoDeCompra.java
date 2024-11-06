package lam;

import java.util.*;

public class CarrinhoDeCompra {
    public static void main(String[] args) {
        CarrinhoDeCompra carrinhoDeCompra = new CarrinhoDeCompra();
        
        carrinhoDeCompra.calcularValorTotal();
    }



    private List<Item> itemList;

    public CarrinhoDeCompra(){
        this.itemList = new ArrayList<>();
    }


        public double calcularValorTotal() {
            if(itemList.isEmpty()){
                throw new RuntimeException("A lista esta vazia");
            }
            return itemList.stream()
                .mapToDouble(item -> item.getPreco() * item.getQuant())
                .sum();
        }


}
