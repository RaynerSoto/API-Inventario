package cu.edu.rayner.apisinventario.serviceImpl;

import cu.edu.rayner.apisinventario.dto.SeccionesDto;
import cu.edu.rayner.apisinventario.service.SeccionesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.UUID;

@Service
public class SeccionesServiceImpl implements SeccionesService {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public void insertar_seccion(SeccionesDto seccionesDto) throws Exception {
        Connection con = jdbcTemplate.getDataSource().getConnection();
        PreparedStatement preparedStatement = con.prepareStatement("Select secciones_insertar(?,?,?)");
        preparedStatement.setString(1,seccionesDto.getIdentificador().toString());
        preparedStatement.setString(2,seccionesDto.getNombre_seccion());
        preparedStatement.setDouble(3,seccionesDto.getMetros_cuadrados());
        preparedStatement.execute();
        preparedStatement.close();
        con.close();
    }

    @Override
    public void modificar_seccion(SeccionesDto seccionesDto) throws Exception {
        Connection con = jdbcTemplate.getDataSource().getConnection();
        PreparedStatement preparedStatement = con.prepareStatement("Select secciones_modificar(?,?,?)");
        preparedStatement.setString(1,seccionesDto.getIdentificador().toString());
        preparedStatement.setString(2,seccionesDto.getNombre_seccion());
        preparedStatement.setDouble(3,seccionesDto.getMetros_cuadrados());
        preparedStatement.execute();
        preparedStatement.close();
        con.close();
    }

    @Override
    public void eliminar_seccion(SeccionesDto seccionesDto) throws Exception {
        Connection con = jdbcTemplate.getDataSource().getConnection();
        PreparedStatement preparedStatement = con.prepareStatement("Select secciones_eliminar(?)");
        preparedStatement.setString(1,seccionesDto.getIdentificador().toString());
        preparedStatement.execute();
        preparedStatement.close();
        con.close();
    }

    @Override
    public ArrayList<SeccionesDto> listado_secciones() throws Exception {
        ArrayList<SeccionesDto> listado_secciones = new ArrayList<>();
        Connection con = jdbcTemplate.getDataSource().getConnection();
        PreparedStatement preparedStatement = con.prepareStatement("Select * From secciones");
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            listado_secciones.add(new SeccionesDto(UUID.fromString(resultSet.getString(1)),resultSet.getString(2),resultSet.getDouble(3)));
        }
        preparedStatement.close();
        con.close();
        return listado_secciones;
    }

    @Override
    public SeccionesDto obtener_secciones_UUID(SeccionesDto sec) throws Exception {
        SeccionesDto seccionesDto = null;
        Connection con = jdbcTemplate.getDataSource().getConnection();
        PreparedStatement preparedStatement = con.prepareStatement("Select * From secciones Where secciones.UUID Like ?");
        preparedStatement.setString(1,sec.getIdentificador().toString());
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            seccionesDto = new SeccionesDto(UUID.fromString(resultSet.getString(1)),resultSet.getString(2),resultSet.getDouble(3));
        }
        preparedStatement.close();
        con.close();
        return seccionesDto;
    }

    @Override
    public SeccionesDto obtener_secciones_nombre(SeccionesDto sec) throws Exception {
        SeccionesDto seccionesDto = null;
        Connection con = jdbcTemplate.getDataSource().getConnection();
        PreparedStatement preparedStatement = con.prepareStatement("Select * From secciones where nombre Like ?");
        preparedStatement.setString(1,sec.getNombre_seccion());
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            seccionesDto = new SeccionesDto(UUID.fromString(resultSet.getString(1)),resultSet.getString(2),resultSet.getDouble(3));
        }
        preparedStatement.close();
        con.close();
        return seccionesDto;
    }
}
