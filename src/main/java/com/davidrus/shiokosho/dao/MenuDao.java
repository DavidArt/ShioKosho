package com.davidrus.shiokosho.dao;

import com.davidrus.shiokosho.domain.Menu;
import org.springframework.stereotype.Repository;

/**
 * Created by david on 26-May-17.
 */
@Repository
public interface MenuDao {

    boolean createMenu(Menu menu);

    Menu getMenuById(Long id);

    boolean updateMenu(Menu menu);

    boolean deleteMenu(Long id);

}
