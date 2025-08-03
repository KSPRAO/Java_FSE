import React from 'react';

const BlogDetails = ({ showBlog }) => {
  if (!showBlog) return null;

  const blogs = [
    { title: 'React Learning', author: 'Stephen Biz', content: 'Welcome to learning React!' },
    { title: 'Installation', author: 'Schwenzdiesr', content: 'You can install React from npm.' },
  ];

  return (
    <div>
      <h1 className="text-2xl font-bold mb-4">Blog Details</h1>
      {blogs.map((blog, index) => (
        <div key={index} className="mb-2">
          <h3 className="text-xl">{blog.title}</h3>
          <p className="text-lg">Author: {blog.author}</p>
          <p className="text-lg">{blog.content}</p>
        </div>
      ))}
    </div>
  );
};

export default BlogDetails;