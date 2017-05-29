package com.davidrus.shiokosho.services;

import com.davidrus.shiokosho.dao.MenuDao;
import com.davidrus.shiokosho.dto.Menu;
import lombok.extern.slf4j.Slf4j;
import org.dozer.Mapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by david on 29-May-17.
 */
@Service
@Slf4j
public class MenuServiceImpl implements MenuService {

    @Resource
    private Mapper mapper;

    @Resource
    private MenuDao menuDao;

    @Override
    public boolean createMenu(Menu menu) {
        com.davidrus.shiokosho.domain.Menu menuDomain = mapper.map(menu, com.davidrus.shiokosho.domain.Menu.class);
        return menuDao.createMenu(menuDomain);
    }

    @Override
    public Menu getMenuById(Long id) {
        com.davidrus.shiokosho.domain.Menu menuDomain = menuDao.getMenuById(id);
        Menu menuDto = mapper.map(menuDomain, Menu.class);
        return menuDto;
    }

    @Override
    public boolean updateMenu(Menu menu) {
        com.davidrus.shiokosho.domain.Menu menuDomain = mapper.map(menu, com.davidrus.shiokosho.domain.Menu.class);
        return menuDao.updateMenu(menuDomain);
    }

    @Override
    public boolean deleteMenu(Long id) {
        return menuDao.deleteMenu(id);
    }
}
