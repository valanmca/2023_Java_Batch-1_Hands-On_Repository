import { CustomPipeFilePipe } from './custom-pipe-file.pipe';

describe('CustomPipeFilePipe', () => {
  it('create an instance', () => {
    const pipe = new CustomPipeFilePipe();
    expect(pipe).toBeTruthy();
  });
});
