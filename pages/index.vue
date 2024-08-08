<template>
  <div>
    <h1>Admin Panel</h1>
    
    <div>
      <input v-model="search" placeholder="Search by name or email" />
    </div>

    <table>
      <thead>
        <tr>
          <th>ID</th>
          <th>Name</th>
          <th>Email</th>
          <th>Age</th>
          <th>Registration Date</th>
        </tr>
      </thead>
      <tbody>
        <tr v-for="user in filteredUsers" :key="user.id">
          <td>{{ user.id }}</td>
          <td>{{ user.name }}</td>
          <td>{{ user.email }}</td>
          <td>{{ user.age }}</td>
          <td>{{ user.registrationDate }}</td>
        </tr>
      </tbody>
    </table>
  </div>
</template>

<script>
export default {
  data() {
    return {
      search: '',
      users: [] // This will hold user data fetched from the API
    };
  },
  computed: {
    filteredUsers() {
      const searchLower = this.search.toLowerCase();
      return this.users.filter(user =>
        user.name.toLowerCase().includes(searchLower) ||
        user.email.toLowerCase().includes(searchLower)
      );
    }
  },
  async mounted() {
    try {
      const response = await fetch('/api/users');
      this.users = await response.json();
    } catch (error) {
      console.error('Error fetching users:', error);
    }
  }
};
</script>

<style scoped>
/* Add your styles here */
table {
  width: 100%;
  border-collapse: collapse;
}
th, td {
  border: 1px solid #ddd;
  padding: 8px;
}
th {
  background-color: #f4f4f4;
}
</style>