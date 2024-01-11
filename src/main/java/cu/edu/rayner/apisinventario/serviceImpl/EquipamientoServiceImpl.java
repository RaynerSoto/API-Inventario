package cu.edu.rayner.apisinventario.serviceImpl;

import cu.edu.rayner.apisinventario.dto.EquipamientoDto;
import cu.edu.rayner.apisinventario.service.EquipamientoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;

@Service
public class EquipamientoServiceImpl implements EquipamientoService {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public void insertar_equipamiento(EquipamientoDto equipamientoDto) throws Exception {
        Connection con = jdbcTemplate.getDataSource().getConnection();
        PreparedStatement preparedStatement = con.prepareStatement("Select cerrajerias_insertar(?,?,?,?,?,?,?)");
        preparedStatement.setString(1,equipamientoDto.getColores().toString());
        preparedStatement.setDouble(2,equipamientoDto.getPrecio());
        preparedStatement.setBoolean(3,equipamientoDto.isFragile());
        preparedStatement.setString(4,equipamientoDto.getEnvase());
        preparedStatement.setLong(5,equipamientoDto.getLote());
        preparedStatement.setString(6,equipamientoDto.getNombre_seccion());
        preparedStatement.setDouble(7,equipamientoDto.getTamanno());
        preparedStatement.execute();
        preparedStatement.close();
        con.close();
    }

    @Override
    public void modificar_equipamiento(EquipamientoDto equipamientoDto) throws Exception {
        Connection con = jdbcTemplate.getDataSource().getConnection();
        PreparedStatement preparedStatement = con.prepareStatement("Select cerrajerias_insertar(?,?,?,?,?,?,?,?)");
        preparedStatement.setString(1,equipamientoDto.getColores().toString());
        preparedStatement.setDouble(2,equipamientoDto.getPrecio());
        preparedStatement.setBoolean(3,equipamientoDto.isFragile());
        preparedStatement.setString(4,equipamientoDto.getEnvase());
        preparedStatement.setLong(5,equipamientoDto.getLote());
        preparedStatement.setString(6,equipamientoDto.getNombre_seccion());
        preparedStatement.setDouble(7,equipamientoDto.getTamanno());
        preparedStatement.setLong(8,equipamientoDto.get);
        preparedStatement.execute();
        preparedStatement.close();
        con.close();
    }

    @Override
    public void eliminar_equipamiento(EquipamientoDto equipamientoDto) throws Exception {

    }

    @Override
    public ArrayList<EquipamientoDto> listado_equipamientos() throws Exception {
        return null;
    }

    @Override
    public EquipamientoDto obtener_equipamientoes_nombre(EquipamientoDto sec) throws Exception {
        return null;
    }
}
