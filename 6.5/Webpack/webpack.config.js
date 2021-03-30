module.exports = {
    entry: {
      app: "./javascript/index"
    },
    output: {
      path: __dirname + '/dist',
      publicPath: '/',
      filename: 'bundle.js'
    },
    module: {
      rules: [
        {
          test: /\.css$/,
          use: [
            { loader: 'style-loader' },
            { loader: 'css-loader'}
          ]
        }
      ]
    },
    watch: true
  };


