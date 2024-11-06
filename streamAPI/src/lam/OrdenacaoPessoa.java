package lam;

import java.util.*;
public class OrdenacaoPessoa {
    
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa(){
        this.pessoaList = new ArrayList<>();
    }


    public List<Pessoa> OrdenarPorAltura(){
        if(!pessoaList.isEmpty()){
            List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
            // pessoasPorAltura.sort((p1, p2) -> Double.compare(p1.getAltura(), p2.getAltura()));
            pessoasPorAltura.sort(Comparator.comparingDouble(Pessoa::getAltura));
            return pessoasPorAltura;
        } else{
            throw new RuntimeException("A lista está vazia");
        }

    }

}
