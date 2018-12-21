package by.polinatsy.dayplanner; 

import org.junit.Test; 

import by.polinatsy.dayplanner.model.*; 
import static org.junit.Assert.*; 

public class ExampleUnitTest { 
@Test 
public void addition_isCorrect() { 
assertEquals(4, 2 + 2); 
} 
@Test 
public void task_test() { 
ModelSeparator modelSeparator = new ModelSeparator(ModelSeparator.TYPE_FUTURE); 
assertEquals(modelSeparator.isTask(), false); 
modelSeparator.setType(ModelSeparator.TYPE_TOMORROW); 
assertEquals(modelSeparator.getType(), ModelSeparator.TYPE_TOMORROW); 
} 
@Test 
public void date_test() { 
ModelTask model = new ModelTask(); 
model.setDate(100); 
assertEquals(model.getDate(), 100); 
} 
@Test 
public void prioruty_test() { 
ModelTask model = new ModelTask(); 
model.setPriority(1); 
assertEquals(model.getPriority(), 1); 
} 
@Test 
public void status_test() { 
ModelTask model = new ModelTask(); 
model.setStatus(2); 
assertEquals(model.getStatus(), 2); 
} 
}
