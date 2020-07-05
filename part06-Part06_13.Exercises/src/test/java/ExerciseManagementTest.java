
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;




public class ExerciseManagementTest {

    private ExerciseManagement management;
    
    @Before
    public void initialize(){
        management = new ExerciseManagement();
    }
    
    @Test
    public void addExerciseTest(){
        
        assertEquals(0, management.exerciseList().size());
    }
    
    @Test
    public void addingExerciseGrowsListByOne(){
        management.add("Write a test");
        assertEquals(1, management.exerciseList().size());
    }
    
    @Test
    public void addedItemIsInList(){
        management.add("Learn more about TDD");
        assertTrue(management.exerciseList().contains("Learn more about TDD"));
    }
    
    @Test
    public void exercisesCanBeMarkedAsCompleted(){
        management.add("Exercise testing");
        management.markAsCompleted("Exercise testing");
        assertTrue(management.isCompleted("Exercise testing"));
    }
}
