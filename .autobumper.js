const tracker = {
  path: 'res/test/test_1.js',
  task: (contents, previousVersion, releaseVersion) => {
    return contents.replace(
      new RegExp(`@since v${previousVersion}-SNAPSHOT`, 'g'),
      `@since v${releaseVersion}-SNAPSHOT`
    );
  }
};

module.exports = {
  bumpFiles: [ tracker ]
};
