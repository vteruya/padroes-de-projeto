package service;

import domain.Orcamento;

import java.math.BigDecimal;

public class DescontoItens extends Desconto {

    public DescontoItens(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal calcular(Orcamento orcamento) {
        if(orcamento.getQuantidadeItens() > 5) {
            return orcamento.getValor().multiply(new BigDecimal("0.1"));
        }

        return proximo.calcular(orcamento);
    }

}
