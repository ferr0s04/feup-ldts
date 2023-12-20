package com.aor.numbers;

public class DivisibleByFilter implements GenericListFilter {
    public DivisibleByFilter(int div) {
        this.div = div;
    }
    @Override
    public boolean accept(Integer number) {
        return number % div == 0;
    }

    public int div;
}
