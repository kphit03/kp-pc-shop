<h1>Kevin Phitsanu Submission README file</h1>
<br>
<br>
<h2>Changes: </h2>

<h2>Task C:</h2>
In main\resources\templates\mainscreen.html <br>
- Line 14: changed title of page to "KP's PC Shop" <br>
- Line 19: changed header of page to "KP PC Shop" <br>
- Line 21: change parts header to "PC Parts and Peripherals" <br>
- Line 53: changed products header to "PC Builds" <br>
<p>
<h2>Task D:</h2>
Created about.html file in \main\resources\templates <br>
Created AboutController in \main\java\com.example.demo\controllers

about.html changes:
- created about.html file in \main\resources\templates
- copied boilerplate code before body from mainscreen.html lines 1-15 to about.html lines 1-15
- added header(h1), subheading(h2), paragraph(p), and a back to home link (a) to the page in lines 49-57
- styled about.html to center the text in lines 15-46
<p>
AboutController changes/additions:

- create AboutController in \main\java\com.example.demo\controllers
- imported Controller and GetMapping in line 3-4
- wrote controller class code for AboutController utilizing GetMapping to return the about page in line 6-13
<p>
mainscreen.html changes/additions:

- at line 25, changed "About Us" h1 into a link with an anchor tag, linked tag to about.html with href
<p>
<h2>Task E:</h2>
Files changed/added: <br>
- main\java\com.example.demo\BootStrapData.java <br>
- main\java\resources\templates\mainscreen.html <br>
- main\java\resources\application.properties <br>

Changes on BootStrapData.java:
- commented out prewritten code on 124-127
- lines 33-106, I created 5 objects for my parts table, and pc products table, and confirmed they were populating with no duplicates

Changes on mainscreen.html:
- line 60, changed h2 text to "PC Products"

Changes on application.properties:
- line 6, changed url ending to refresh database

<h2>Task F:</h2>
Files changed/added: <br>
- mainscreen.html <br>
- Success.html(added) <br>
- Failure.html(added) <br>
- AddProductController.java <br>
- application.properties <br>
<p>
Changes on mainscreen.html:

- Added "Buy Now" button linked to /buyProduct on line 92
<p>
Changes on AddProductController.java:<br>
- Line 176-199, created method to return "Failure.html" or "Success.html" pages.<br>
- On line 192-194, added if statement to see if inventory value == 0, if it is not 0. If it is 0, it returns "Failure", if not 0, it returns "Success"<br>

<br>
Changes on Success.html:<br>
- Created Success.html<br>
- Added successful purchase message on line 12<br>
- added a link to return to home page on line 16<br>

<br>
Changes on Failure.html:<br>
- Created Failure.html<br>
- Added fail to purchase message on line 12<br>
- added a link to return to home page on line 16<br>

Changes on application.properties:
- line 6, changed url ending to refresh database

<p>
<h2>Task G:</h2>
Files changed/added: <br>
    - mainscreen.html<br>
    - InHousePartForm.html<br>
    - OutsourcedPartForm.html<br>
    - productForm.html<br>
    - application.properties<br>
    - InventoryValidator.java<br>
    - ProductInventoryValidator.java<br>
    - ValidInventory.java<br>
    - ValidProductInventory.java<br>
    - Part.java<br>
    - Product.java<br>
    - BootStrapData.java<br>
<p>
<br>
Changes on mainscreen.html:<br>
    - Line 45-46 and line 85-86, added columns for min and max inventory values<br>
    - Line 55-56 and line 96-97, added columns for min and max inventory values<br>
<br>
Changes on InHousePartForm.html:<br>
- Created InHousePartForm.html<br>
- line 24-38, added new fields for min and max inventory, and added error checking that will display error text<br>
Changes on OutsourcedPartForm:<br>
- Created OutsourcedPartForm.html<br>
- line 25-40, added new fields for min and max inventory, and added error checking that will display error text<br>
<br>
Changes on productForm.html:<br>
- line 23-27, added new fields for min and max inventory<br>
- line 78, added link to return to main screen<br>
<br>
Changes on application.properties<br>
- Changed url ending on line 6 to refresh databases <br>
<br>
Changes on InventoryValidator.java<br>
- Created InventoryValidator.java (copied DeletePartValidator and renamed it)
- Line 26-43, created "isValid" to error check inventory of parts. If statements check if inventory is greater than min, and less than max<br>
-- validation will send error messages if the error check returns false<br>
<br>
Changes on ProductInventoryValidator.java<br>
- Created ProductInventoryValidator.java (copied DeletePartValidator and renamed it)
- Line 22-40, created "isValid" to error check inventory of product. If statements check if inventory is greater than min, and less than max<br>
-- validation will send error messages if the error check returns false<br>
<br>
Changes on ValidInventory.java<br>
- Created ValidInventory.java, copied file from ValidDeletePart and renamed it<br>
- Line 16, changed parameter to "InventoryValidator.class"<br>
- Line 19, changed method to be for "ValidInventory"<br>
- Line 20, changed message to "Inventory Error"<br>
<br>
Changes on ValidProductInventory.java<br>
- Created ValidProductInventory.java, copied file from ValidDeletePart and renamed it<br>
- Line 16, changed parameter to "ProductInventoryValidator.class"<br>
- Line 19, changed method to be for "ValidProductInventory"<br>
- Line 20, changed message to "Inventory Error"<br>
<br>
Changes on Part.java<br>
- Line 24, added "@ValidInventory" into the class<br>
- Line 34-39, added minInv and maxInv constructors<br>
- Line 62-78, added getters and setters for min and max<br>
<br>
Changes on Product.java<br>
- Line 24, added "@ValidProductInventory" into the class<br>
- Line 36-41, added minInv and maxInv constructors<br>
- Line 58-73, added getters and setters for min and max<br>
<br>
Changes on BootStrapData.java<br>
- Line 40-41, 50-51, 59-60, 67-68, 76-77, 88-89, 96-97, 104-105, 112-113, 120-121, added setters for min and max inventory values on each object<br>
<br>
<p></p>
<h2>Task H:</h2>
Files changed/adjusted<br>
MaximumValidator.java<br>
MinimumValidator.java<br>
ValidMaximum.java<br>
ValidMinimum.java<br>
EnufPartsValidator.java<br>
Part.java<br>
<br>
<br>
Changes on MaximumValidator.java:<br>
- Created MaximumValidator.java<br>
- Created initialize and isValid methods on lines 16-24<br>
<br>
Changes on MinimumValidator.java:<br>
- Created MinimumValidator.java<br>
- Created initialize and isValid methods on lines 16-24 (Copied MaximumValidator.java file)<br>
<br>
Changes on ValidMaximum.java:<br>
- Created ValidMaximum.java<br>
- Copied from ValidInventory<br>
- Changed message on line 16 to "Part count above maximum"<br>
<br>
Changes on ValidMinimum.java:<br>
- Created ValidMinimum.java<br>
- Copied from ValidInventory<br>
- Changed message on line 20 to "Part count below minimum"<br>
<br>
Changes on EnufPartsValidator.java<br>
- rewrote if statement that will send message for insufficient inventory on a part on line 35-39<br>
<br>
Changes on Part.java<br>
- imported ValidMinimum and ValidMaximum on line 5-6 and 27-28<br>
<br>
<br>
<h2>Task I:</h2><br>
- Files changed<br>
- PartTest.java in \test\java\com.example.demo\domain\PartTest.java<br>
<br>
Changes in PartTest.java<br>
- Lines 159-195 created 4 unit tests for testing with getters and setters<br>
<p></p>
<br>
<h2>Task J:</h2><br>
- Deleted unused validators<br>
- Deleted "DeletePartValidator.java" and "ValidDeletePart.java" in \main\java\com.example.demo\validators<br>
- Refreshed application.properties line 6 and changed it's url ending to refresh DB<br>