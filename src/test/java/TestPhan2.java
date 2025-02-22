import org.example.SanPhamService;
import org.example.entity.SanPham;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestPhan2 {
    SanPhamService sanPhamService;

    @BeforeEach
    public void setUp() {
        sanPhamService = new SanPhamService();
    }

    @Test
    public void xoa_Valid() {
        sanPhamService.themSanPham(new SanPham("001", "Dien thoai", 1, 1000000, 20, "Dien thoai"));
        sanPhamService.xoaSanPham("001");
        Assertions.assertEquals(0, sanPhamService.getAll().size());
    }

    @Test
    public void xoa_Invalid1() {
        SanPhamService service = new SanPhamService();
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> {
            service.xoaSanPham("SP01");
        });
    }

    @Test
    public void xoa_Invalid2() {
        SanPhamService service = new SanPhamService();
        service.themSanPham(new SanPham("SP01", "Laptop", 2, 100000, 10, "Category"));
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            service.xoaSanPham(null);
        });
    }

    @Test
    public void xoa_Invalid3() {
        SanPhamService service = new SanPhamService();
        service.themSanPham(new SanPham("SP01", "Laptop", 2, 100000, 10, "Category"));
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            service.xoaSanPham("   ");
        });
    }

    @Test
    public void xoa_Invalid4() {
        SanPhamService service = new SanPhamService();
        service.themSanPham(new SanPham("SP01", "Laptop", 2, 100000, 10, "Category"));
        boolean result = service.xoaSanPham("SP02");
        Assertions.assertFalse(result);
    }
}
