function ListEmployeeComponent() {
  const dummyData = [
    {
      id: 1,
      firstName: "Jonas",
      lastName: "doe",
      email: "jonasdoe@gmail.com",
    },

    {
      id: 2,
      firstName: "John",
      lastName: "cena",
      email: "johncena@gmail.com",
    },

    {
      id: 3,
      firstName: "Joy",
      lastName: "kent",
      email: "joykent@gmail.com",
    },

    {
      id: 4,
      firstName: "Joe",
      lastName: "boy",
      email: "joeboy@gmail.com",
    },
  ];
  return (
    <div>
      <h2>List of Employees</h2>
      <table>
        <thead>
          <tr>
            <th>Employee Id</th>
            <th>Employee First Name</th>
            <th>Employee Last Name</th>
            <th>Employee Email Id</th>
          </tr>
        </thead>
        <tbody>
          {dummyData.map((employee) => (
            <tr key={employee.id}>
              <td>{employee.id}</td>
              <td>{employee.firstName}</td>
              <td>{employee.lastName}</td>
              <td>{employee.email}</td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
}

export default ListEmployeeComponent;
