package com.davidrus.shiokosho.services;

import com.davidrus.shiokosho.dto.Menu;
import org.springframework.stereotype.Service;

/**
 * Created by david on 29-May-17.
 */
@Service
public interface MenuService {

    boolean createMenu(Menu menu);

    Menu getMenuById(Long id);

    boolean updateMenu(Menu menu);

    boolean deleteMenu(Long id);

}
