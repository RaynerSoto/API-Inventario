package cu.edu.rayner.apisinventario.serviceImpl;

import cu.edu.rayner.apisinventario.dto.EquipamientoDto;
import cu.edu.rayner.apisinventario.enums.Colores;
import cu.edu.rayner.apisinventario.service.EquipamientoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
        preparedStatement.setLong(8,equipamientoDto.getId());
        preparedStatement.execute();
        preparedStatement.close();
        con.close();
    }

    @Override
    public void eliminar_equipamiento(Long id) throws Exception {
        Connection con = jdbcTemplate.getDataSource().getConnection();
        PreparedStatement preparedStatement = con.prepareStatement("Select cerrajerias_(?)");
        preparedStatement.setLong(1,id);
        preparedStatement.execute();
        preparedStatement.close();
        con.close();
    }

    @Override
    public ArrayList<EquipamientoDto> listado_equipamientos() throws Exception {
        ArrayList<EquipamientoDto> listado_equipamientos = new ArrayList<>();
        Connection con = jdbcTemplate.getDataSource().getConnection();
        PreparedStatement preparedStatement = con.prepareStatement("SELECT * FROM public.cerrajerias\n" +
                "ORDER BY id ASC ");
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            EquipamientoDto equipamientoDto = new EquipamientoDto();
            equipamientoDto.setId(resultSet.getLong(1));
            equipamientoDto.setColores(Colores.valueOf(resultSet.getString(2)));
            equipamientoDto.setPrecio(resultSet.getDouble(3));
            equipamientoDto.setFragile(resultSet.getBoolean(4));
            equipamientoDto.setEnvase(resultSet.getString(5));
            equipamientoDto.setLote(resultSet.getLong(6));
            equipamientoDto.setNombre_seccion(resultSet.getString(7));
            equipamientoDto.setTamanno(resultSet.getDouble(8));
            listado_equipamientos.add(equipamientoDto);
        }
        preparedStatement.close();
        con.close();
        return listado_equipamientos;
    }

    public ArrayList<EquipamientoDto> listado_equipamientos_seccion(String nombre_seccion) throws Exception {
        ArrayList<EquipamientoDto> listado_equipamientos = new ArrayList<>();
        Connection con = jdbcTemplate.getDataSource().getConnection();
        PreparedStatement preparedStatement = con.prepareStatement("SELECT * FROM public.cerrajerias Where nombre_seccion Like ?");
        preparedStatement.setString(1,nombre_seccion);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            EquipamientoDto equipamientoDto = new EquipamientoDto();
            equipamientoDto.setId(resultSet.getLong(1));
            equipamientoDto.setColores(Colores.valueOf(resultSet.getString(2)));
            equipamientoDto.setPrecio(resultSet.getDouble(3));
            equipamientoDto.setFragile(resultSet.getBoolean(4));
            equipamientoDto.setEnvase(resultSet.getString(5));
            equipamientoDto.setLote(resultSet.getLong(6));
            equipamientoDto.setNombre_seccion(resultSet.getString(7));
            equipamientoDto.setTamanno(resultSet.getDouble(8));
            listado_equipamientos.add(equipamientoDto);
        }
        preparedStatement.close();
        con.close();
        return listado_equipamientos;
    }

    @Override
    public ArrayList<EquipamientoDto> listado_equipamientos_lote_mayor(Long valor) throws Exception {
        ArrayList<EquipamientoDto> listado_equipamientos = new ArrayList<>();
        Connection con = jdbcTemplate.getDataSource().getConnection();
        PreparedStatement preparedStatement = con.prepareStatement("SELECT * FROM public.cerrajerias Where lote > ?");
        preparedStatement.setLong(1,valor);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            EquipamientoDto equipamientoDto = new EquipamientoDto();
            equipamientoDto.setId(resultSet.getLong(1));
            equipamientoDto.setColores(Colores.valueOf(resultSet.getString(2)));
            equipamientoDto.setPrecio(resultSet.getDouble(3));
            equipamientoDto.setFragile(resultSet.getBoolean(4));
            equipamientoDto.setEnvase(resultSet.getString(5));
            equipamientoDto.setLote(resultSet.getLong(6));
            equipamientoDto.setNombre_seccion(resultSet.getString(7));
            equipamientoDto.setTamanno(resultSet.getDouble(8));
            listado_equipamientos.add(equipamientoDto);
        }
        preparedStatement.close();
        con.close();
        return listado_equipamientos;
    }

    @Override
    public ArrayList<EquipamientoDto> listado_equipamientos_fragile(Boolean fragile) throws Exception {
        ArrayList<EquipamientoDto> listado_equipamientos = new ArrayList<>();
        Connection con = jdbcTemplate.getDataSource().getConnection();
        PreparedStatement preparedStatement = con.prepareStatement("SELECT * FROM public.cerrajerias Where fragile = ?");
        preparedStatement.setBoolean(1, fragile);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            EquipamientoDto equipamientoDto = new EquipamientoDto();
            equipamientoDto.setId(resultSet.getLong(1));
            equipamientoDto.setColores(Colores.valueOf(resultSet.getString(2)));
            equipamientoDto.setPrecio(resultSet.getDouble(3));
            equipamientoDto.setFragile(resultSet.getBoolean(4));
            equipamientoDto.setEnvase(resultSet.getString(5));
            equipamientoDto.setLote(resultSet.getLong(6));
            equipamientoDto.setNombre_seccion(resultSet.getString(7));
            equipamientoDto.setTamanno(resultSet.getDouble(8));
            listado_equipamientos.add(equipamientoDto);
        }
        preparedStatement.close();
        con.close();
        return listado_equipamientos;
    }
    @Override
    public ArrayList<EquipamientoDto> listado_equipamientos_color(String color) throws Exception {
        ArrayList<EquipamientoDto> listado_equipamientos = new ArrayList<>();
        Connection con = jdbcTemplate.getDataSource().getConnection();
        PreparedStatement preparedStatement = con.prepareStatement("SELECT * FROM public.cerrajerias Where color LIKE ?");
        preparedStatement.setString(1, color);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            EquipamientoDto equipamientoDto = new EquipamientoDto();
            equipamientoDto.setId(resultSet.getLong(1));
            equipamientoDto.setColores(Colores.valueOf(resultSet.getString(2)));
            equipamientoDto.setPrecio(resultSet.getDouble(3));
            equipamientoDto.setFragile(resultSet.getBoolean(4));
            equipamientoDto.setEnvase(resultSet.getString(5));
            equipamientoDto.setLote(resultSet.getLong(6));
            equipamientoDto.setNombre_seccion(resultSet.getString(7));
            equipamientoDto.setTamanno(resultSet.getDouble(8));
            listado_equipamientos.add(equipamientoDto);
        }
        preparedStatement.close();
        con.close();
        return listado_equipamientos;
    }

    @Override
    public ArrayList<EquipamientoDto> listado_equipamientos_color(Double minimo, Double maximo) throws Exception {
        if (minimo > maximo){
            double salva = maximo;
            maximo = minimo;
            minimo = salva;
        }
        ArrayList<EquipamientoDto> listado_equipamientos = new ArrayList<>();
        Connection con = jdbcTemplate.getDataSource().getConnection();
        PreparedStatement preparedStatement = con.prepareStatement("SELECT * FROM public.cerrajerias Where precio >= ? and precio <= ?");
        preparedStatement.setDouble(1, minimo);
        preparedStatement.setDouble(2,maximo);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            EquipamientoDto equipamientoDto = new EquipamientoDto();
            equipamientoDto.setId(resultSet.getLong(1));
            equipamientoDto.setColores(Colores.valueOf(resultSet.getString(2)));
            equipamientoDto.setPrecio(resultSet.getDouble(3));
            equipamientoDto.setFragile(resultSet.getBoolean(4));
            equipamientoDto.setEnvase(resultSet.getString(5));
            equipamientoDto.setLote(resultSet.getLong(6));
            equipamientoDto.setNombre_seccion(resultSet.getString(7));
            equipamientoDto.setTamanno(resultSet.getDouble(8));
            listado_equipamientos.add(equipamientoDto);
        }
        preparedStatement.close();
        con.close();
        return listado_equipamientos;
    }

    @Override
    public ArrayList<EquipamientoDto> listado_equipamientos_envase(String envase) throws Exception {
        ArrayList<EquipamientoDto> listado_equipamientos = new ArrayList<>();
        Connection con = jdbcTemplate.getDataSource().getConnection();
        PreparedStatement preparedStatement = con.prepareStatement("SELECT * FROM public.cerrajerias Where envase LIKE ?");
        preparedStatement.setString(1, envase);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            EquipamientoDto equipamientoDto = new EquipamientoDto();
            equipamientoDto.setId(resultSet.getLong(1));
            equipamientoDto.setColores(Colores.valueOf(resultSet.getString(2)));
            equipamientoDto.setPrecio(resultSet.getDouble(3));
            equipamientoDto.setFragile(resultSet.getBoolean(4));
            equipamientoDto.setEnvase(resultSet.getString(5));
            equipamientoDto.setLote(resultSet.getLong(6));
            equipamientoDto.setNombre_seccion(resultSet.getString(7));
            equipamientoDto.setTamanno(resultSet.getDouble(8));
            listado_equipamientos.add(equipamientoDto);
        }
        preparedStatement.close();
        con.close();
        return listado_equipamientos;
    }
}
