package com.example.demo.validators;

import com.example.demo.domain.Part;
import com.example.demo.domain.Product;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 *
 *
 *
 *
 */
public class ProductInventoryValidator implements ConstraintValidator<ValidProductInventory, Product> {
    @Override
    public void initialize(ValidProductInventory constraintAnnotation) {
//        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(Product product, ConstraintValidatorContext constraintValidatorContext) {
        //code to make sure inventory is between min and max
        if(product.getInv() > product.getMaxInv()) {
            //display error when inv is greater than the max

            constraintValidatorContext.buildConstraintViolationWithTemplate("Solution: Fix your inventory, it is greater than the max").addConstraintViolation();
            return false;
        }
        if(product.getInv() < product.getMinInv()) {
            //display error when inv is less than the max

            constraintValidatorContext.buildConstraintViolationWithTemplate("Solution: Fix your inventory, it is less than the min").addConstraintViolation();
            return false;
        }

                return true;
            }
    }

