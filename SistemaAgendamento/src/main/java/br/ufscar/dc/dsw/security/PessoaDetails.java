package br.ufscar.dc.dsw.security;

import java.util.Arrays;
import java.util.Collection;
 
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import br.ufscar.dc.dsw.domain.Pessoa;
 
@SuppressWarnings("serial")
public class PessoaDetails implements UserDetails {
 
    private Pessoa pessoa;
     
    public PessoaDetails(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
 
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        SimpleGrantedAuthority authority = new SimpleGrantedAuthority(pessoa.getRole());
        return Arrays.asList(authority);
    }
 
    @Override
    public String getPassword() {
        return pessoa.getSenha();
    }
 
    @Override
    public String getUsername() {
        return pessoa.getEmail();
    }
 
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }
 
    @Override
    public boolean isAccountNonLocked() {
        return true;
    }
 
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }
 
    @Override
    public boolean isEnabled() {
        return true;
    }

	public Pessoa getPessoa() {
		return pessoa;
	}
    
}