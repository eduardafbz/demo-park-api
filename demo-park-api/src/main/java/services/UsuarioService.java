package services;

import org.springframework.stereotype.Service;

import entities.Usuario;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import repositories.UsuarioRepository;

@RequiredArgsConstructor
@Service
public class UsuarioService {
    
    private final UsuarioRepository usuarioRepository;

    @Transactional
    public Usuario salvar(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

}
