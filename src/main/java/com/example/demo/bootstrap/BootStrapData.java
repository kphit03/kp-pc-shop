package com.example.demo.bootstrap;

import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Product;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 *
 *
 *
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;

    private final OutsourcedPartRepository outsourcedPartRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, OutsourcedPartRepository outsourcedPartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.outsourcedPartRepository=outsourcedPartRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        //prevents duplication
        if(outsourcedPartRepository.count() == 0) {
        // creating graphics card outsourcedpart
        OutsourcedPart graphicsCard = new OutsourcedPart();

        graphicsCard.setName("Graphics Card");
        graphicsCard.setInv(42);
        graphicsCard.setMinInv(1);
        graphicsCard.setMaxInv(99);
        graphicsCard.setPrice(499.99);
        // save into repository
        outsourcedPartRepository.save(graphicsCard);

        OutsourcedPart cpu = new OutsourcedPart();
        cpu.setName("CPU");
        cpu.setPrice(299.99);
        cpu.setInv(51);
        cpu.setMinInv(1);
        cpu.setMaxInv(99);
        outsourcedPartRepository.save(cpu);

        // created mouse
        OutsourcedPart mouse = new OutsourcedPart();
        mouse.setName("Mouse");
        mouse.setInv(92);
        mouse.setPrice(29.99);
        mouse.setMinInv(1);
        mouse.setMaxInv(99);
        outsourcedPartRepository.save(mouse);
        // created keyboard
        OutsourcedPart keyboard = new OutsourcedPart();
        keyboard.setName("Keyboard");
        keyboard.setInv(76);
        keyboard.setPrice(69.99);
        keyboard.setMinInv(1);
        keyboard.setMaxInv(99);
        outsourcedPartRepository.save(keyboard);
        // creating monitor
        OutsourcedPart monitor = new OutsourcedPart();

        monitor.setName("Monitor");
        monitor.setInv(35);
        monitor.setPrice(79.99);
        monitor.setMinInv(1);
        monitor.setMaxInv(99);
        outsourcedPartRepository.save(monitor);
        }

        // PC BUILDS TABLE
        if(productRepository.count() == 0) {
            // gaming setup
            Product gamingSetup = new Product();
            gamingSetup.setName("Gaming Setup");
            gamingSetup.setPrice(999.99);
            gamingSetup.setInv(8);
            gamingSetup.setMinInv(1);
            gamingSetup.setMaxInv(99);
            productRepository.save(gamingSetup);
            // triple monitor bundle
            Product monitors = new Product();
            monitors.setName("Triple Monitor Bundle");
            monitors.setPrice(110.99);
            monitors.setInv(4);
            monitors.setMinInv(1);
            monitors.setMaxInv(99);
            productRepository.save(monitors);
            // mouse + keyboard combo
            Product mnk = new Product();
            mnk.setName("Mouse + Keyboard Combo");
            mnk.setPrice(79.99);
            mnk.setInv(10);
            mnk.setMinInv(1);
            mnk.setMaxInv(99);
            productRepository.save(mnk);

            Product pccombo = new Product();
            pccombo.setName("PC + Monitor Combo");
            pccombo.setPrice(1049.99);
            pccombo.setInv(3);
            pccombo.setMinInv(1);
            pccombo.setMaxInv(99);
            productRepository.save(pccombo);

            Product budgetPC = new Product();
            budgetPC.setName("Budget Gaming PC");
            budgetPC.setPrice(699.99);
            budgetPC.setInv(18);
            budgetPC.setMinInv(1);
            budgetPC.setMaxInv(99);
            productRepository.save(budgetPC);

        }



       /*
        OutsourcedPart o= new OutsourcedPart();
        o.setCompanyName("Western Governors University");
        o.setName("out test");
        o.setInv(5);
        o.setPrice(20.0);
        o.setId(100L);
        outsourcedPartRepository.save(o);
        OutsourcedPart thePart=null;
        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            if(part.getName().equals("out test"))thePart=part;
        }

        System.out.println(thePart.getCompanyName());
        */
//        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
//        for(OutsourcedPart part:outsourcedParts){
//            System.out.println(part.getName()+" "+part.getCompanyName());
//        }

        /*
        Product bicycle= new Product("bicycle",100.0,15);
        Product unicycle= new Product("unicycle",100.0,15);
        productRepository.save(bicycle);
        productRepository.save(unicycle);
        */

        System.out.println("Started in Bootstrap");
        System.out.println("Number of Products"+productRepository.count());
        System.out.println(productRepository.findAll());
        System.out.println("Number of Parts"+partRepository.count());
        System.out.println(partRepository.findAll());

    }
}
