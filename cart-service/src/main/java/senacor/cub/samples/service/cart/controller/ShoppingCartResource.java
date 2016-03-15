package senacor.cub.samples.service.cart.controller;

import org.springframework.hateoas.ResourceSupport;
import senacor.cub.samples.service.cart.command.ShoppingCart;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

/**
 * Created by rwinzing on 14.03.16.
 */
public class ShoppingCartResource extends ResourceSupport {
    private ShoppingCart shoppingCart;

    public ShoppingCartResource(ShoppingCart shoppingCart) {
        String username = shoppingCart.getUsername();
        String cartNo = shoppingCart.getCartNo();

        System.out.println("cartNo = " + cartNo);
        System.out.println("username = " + username);

        this.shoppingCart = shoppingCart;
        this.add(linkTo(methodOn(CartController.class, username, cartNo).readShoppingCart(username, cartNo)).withSelfRel());
        this.add(linkTo(methodOn(CartController.class, username, cartNo).discardShoppingCart(username, cartNo)).withRel("discard"));
    }

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }
}
