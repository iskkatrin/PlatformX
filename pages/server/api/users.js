export default function (req, res) {
    fetch('http://localhost:8080/users') 
      .then(response => response.json())
      .then(data => res.json(data))
      .catch(error => {
        console.error('Error:', error);
        res.status(500).json({ error: 'Failed to fetch data' });
      });
  }