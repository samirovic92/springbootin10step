package com.samirovic.springbootin10step.service;

import com.samirovic.springbootin10step.dao.DataService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class SomeBusinessTest {

    @Mock
    DataService dataService;

    @InjectMocks
    SomeBusinessImpl someBusiness;

    @Test
    public void testFindTheGreatest() {
        when(dataService.getAllData()).thenReturn(new int[] {122, 34 ,5 });
        assertEquals( 122, someBusiness.findTheGreatest() );
    }

    @Test
    public void testListGet(){
        List list = mock(List.class);
        when(list.get(anyInt())).thenReturn("Hello");
        assertEquals("Hello",list.get(0));
        assertEquals("Hello",list.get(1));
    }
}
