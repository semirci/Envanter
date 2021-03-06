package com.emirci.envanter.dao;

import com.emirci.envanter.model.Trademark;

import java.util.List;


public interface TrademarkDao extends GenericDao<Trademark, Long> {

    public boolean removeTrademark(Long id);

    public boolean isTrademark(Long id);

    public Trademark getTrademark(Long id);

}
