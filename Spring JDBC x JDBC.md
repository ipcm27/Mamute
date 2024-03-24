## JDBC

@Component
public class TodoJdbcService implements TodoDataService {

	@Autowired
	DataSource datasource;

	// Think about exception handling
	// We are explicitly getting the connection! What if there is an
	// exception while executing the query!

	@Override
	public List<Todo> retrieveTodos(String user)
			throws SQLException {
		Connection connection = datasource.getConnection();

		PreparedStatement st = connection.prepareStatement(
				"SELECT * FROM TODO where user=?");

		st.setString(1, user);

		ResultSet resultSet = st.executeQuery();
		List<Todo> todos = new ArrayList<>();

		while (resultSet.next()) {

			Todo todo = new Todo(resultSet.getInt("id"),
					resultSet.getString("user"),
					resultSet.getString("desc"),
					resultSet.getTimestamp("target_date"),
					resultSet.getBoolean("is_done"));
			todos.add(todo);
		}

		st.close();

		connection.close();

		return todos;

	}

 ## Spring:

 @Component
public class TodoJdbcService implements TodoDataService {

	@Autowired
	DataSource datasource;

	// Think about exception handling
	// We are explicitly getting the connection! What if there is an
	// exception while executing the query!

	@Override
	public List<Todo> retrieveTodos(String user)
			throws SQLException {
		Connection connection = datasource.getConnection();

		PreparedStatement st = connection.prepareStatement(
				"SELECT * FROM TODO where user=?");

		st.setString(1, user);

		ResultSet resultSet = st.executeQuery();
		List<Todo> todos = new ArrayList<>();

		while (resultSet.next()) {

			Todo todo = new Todo(resultSet.getInt("id"),
					resultSet.getString("user"),
					resultSet.getString("desc"),
					resultSet.getTimestamp("target_date"),
					resultSet.getBoolean("is_done"));
			todos.add(todo);
		}

		st.close();

		connection.close();

		return todos;

	}
