package com.project.service;

public interface OrderItemService {

   /**
    * add menuItem to cart based on menuItemId
    * @param menuItemId
    * @return success return 1, fail return 0
    */
   int addMenuItemToCart(Integer menuItemId);

}
