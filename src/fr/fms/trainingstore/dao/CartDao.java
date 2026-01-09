/**
 * 
 */
package fr.fms.trainingstore.dao;

import fr.fms.trainingstore.domain.Cart;

/**
 * @author ZribaY
 *
 */
public interface CartDao {

	Cart findOrCreateByUserId(int userId);

    Cart findByUserId(int userId);

    boolean addTraining(int userId, int trainingId);

    boolean removeOneTraining(int userId, int trainingId);

    boolean clearCart(int userId);
}
