import org.example.MathService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestPhan1 {

    MathService mathService;

    @BeforeEach
    public void setUp() {
        mathService = new MathService();
    }

    @Test
    public void testPhanVung_Valid(){
        Assertions.assertEquals(9, mathService.tinhTongSoNguyen(6));
    }

    @Test
    public void testPhanVung_Invalid1(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> mathService.tinhTongSoNguyen(0) );
    }

    @Test
    public void testPhanVung_Invalid2(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> mathService.tinhTongSoNguyen(-100) );
    }

    @Test
    public void testPhanVung_Invalid3(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> mathService.tinhTongSoNguyen(Integer.MAX_VALUE + 1) );
    }

    @Test
    public void testPhanVung_Invalid4(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> mathService.tinhTongSoNguyen(null) );
    }

    @Test
    public void testVungBien_Valid1(){
        Assertions.assertEquals(1, mathService.tinhTongSoNguyen(1));
    }

    @Test
    public void testVungBien_Valid2(){
        Assertions.assertEquals(25000000, mathService.tinhTongSoNguyen(10000));
    }

    @Test
    public void testVungBien_Invalid1(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> mathService.tinhTongSoNguyen(-1));
    }

    @Test
    public void testVungBien_Invalid2(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> mathService.tinhTongSoNguyen(10001));
    }
}
