package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

public class ListFiltererTest {
    @Test
    public void PositiveFilter() {
        GenericListFilter filter = new PositiveFilter();
        ListFilterer filterer = new ListFilterer(filter);

        List<Integer> list = Arrays.asList(-1, 0, 1, 2, 3);

        List<Integer> filteredList = filterer.filter(list);

        List<Integer> expected = Arrays.asList(1, 2, 3);
        Assertions.assertEquals(expected, filteredList);
    }

    @Test
    public void DivisibleByFilter() {
        GenericListFilter filter = new DivisibleByFilter(2);
        ListFilterer filterer = new ListFilterer(filter);

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> filteredList = filterer.filter(list);

        List<Integer> expected = Arrays.asList(2, 4);
        Assertions.assertEquals(expected, filteredList);
    }
}

