// src/Posts.js
import React from 'react';
import Post from './Post';

class Posts extends React.Component 
{
  constructor(props) {
    super(props);
    this.state = {
      posts: [],
      hasError: false
    };
  }

  // Fetch posts from API and map to Post class
  loadPosts() {
    fetch('https://jsonplaceholder.typicode.com/posts')
      .then(response => response.json())
      .then(data => {
        const postObjects = data.slice(0, 10).map(
          post => new Post(post.id, post.title, post.body)
        );
        this.setState({ posts: postObjects });
      })
      .catch(error => {
        console.error('Error fetching posts:', error);
        this.setState({ hasError: true });
      });
  }

  // Lifecycle hook
  componentDidMount() {
    this.loadPosts();
  }

  // Error handler
  componentDidCatch(error, info) {
    console.error("Error in Posts component:", error, info);
    alert("An error occurred while loading posts.");
    this.setState({ hasError: true });
  }

  // Render post list
  render() {
    if (this.state.hasError) {
      return <h2>Error loading posts. Please try again later.</h2>;
    }

    return (
      <div style={{ padding: '20px' }}>
        <h2>Posts List</h2>
        {this.state.posts.map(post => (
          <div key={post.id} style={{ border: '1px solid gray', margin: '10px 0', padding: '10px' }}>
            <h3>{post.title}</h3>
            <p>{post.body}</p>
          </div>
        ))}
      </div>
    );
  }
}

export default Posts;
