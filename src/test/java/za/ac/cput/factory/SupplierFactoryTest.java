/*

Author Shuaib Allie

 */

package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.entity.Supplier;

import static org.junit.jupiter.api.Assertions.*;

class SupplierFactoryTest {

    @Test
    void createSupplier() {
        Supplier supplier= SupplierFactory.createSupplier("Davids","2 Unity Road","davids34@gmail.com",021457457, 22);
        assertNotNull(supplier);
        System.out.println("Create Supplier ");
        System.out.println(supplier);
        System.out.println("Supplier added....");
    }


}