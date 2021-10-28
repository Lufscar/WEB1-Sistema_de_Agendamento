package br.ufscar.dc.dsw.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import br.ufscar.dc.dsw.dao.IAdminDAO;
import br.ufscar.dc.dsw.domain.Admin;
 
public class AdminDetailsServiceImpl implements UserDetailsService {
 
    @Autowired
    private IAdminDAO dao;
     
    @Override
    public UserDetails loadUserByUsername(String username)
            throws UsernameNotFoundException {
        Admin admin = dao.getUserByUsername(username);
         
        if (admin == null) {
            throw new UsernameNotFoundException("Could not find user");
        }
         
        return new AdminDetails(admin);
    }
}